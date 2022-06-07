package me.mrpro.test.testpl.folder;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.minecraft.server.v1_16_R1.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_16_R1.PlayerConnection;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.util.Random;

public class SkinGrabber {
    public static void changeSkin(Player player) {
        GameProfile profile = ((CraftPlayer)player).getHandle().getProfile();
        PlayerConnection connection = ((CraftPlayer)player).getHandle().playerConnection;
        connection.sendPacket(new PacketPlayOutPlayerInfo(
                PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER,
                    ((CraftPlayer)player).getHandle()));
        profile.getProperties().removeAll("textures");
        profile.getProperties().put("textures", getSkin());
        connection.sendPacket(new PacketPlayOutPlayerInfo(
                PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER,
                    ((CraftPlayer)player).getHandle()));
    }

    private static Property getSkin() {
        Random g = new Random();
        int num = g.nextInt(4);
        switch(num){
            case 0: return new Property("textures", "ewogICJ0aW1lc3RhbXAiIDogMTYzNDM1NTM5NDkzNywKICAicHJvZmlsZUlkIiA6ICJlNzkzYjJjYTdhMmY0MTI2YTA5ODA5MmQ3Yzk5NDE3YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVfSG9zdGVyX01hbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yMjA1MWQzYTUwNGJlOWMxOWM4YTU0YTZhZmYzYzZkMDFkZTYwMjk4ZTI1MmRlMTc2YzQwMjA2YmYzZTcxNTM0IgogICAgfQogIH0KfQ==", "IF765I3/KHYR6z7rrxURXMJg2i0Wsb4oCFSaGYlQMDc9aK2TlZbsunnzcwyxvU23NdxNSvGRDKjaKFKY9H8j5T007/dnFKTFyH+I0YlF1acOA6/V2wHrYX1GyK3NG09boAhMOWWfEhRbpLP3phU6GpBgntJxAXMm9WPBljz0Glnx6mR9lay01gwzZlGtmdSB474UCD19o0hztnylrYWWY5MtT/5AE2T6BX6rPu7IDdOBeJjAmiNTo5Akwf+t3EactXTNDgu2pH0k8itEZKVoIpVnyPOM2/JVcs4f5FRdDfaxL0cmDxVabqAL/ZPAD9KjkR0DfDDM00x/xXVS6YCnv0X8yourhHmkqf6nocAYaq2xF5X1k9I7CcTXgHKUIzCyEjnEHLJY3WVfWS/61hkcvUp+s8Jnq9JC8dM9xnPnyIljUsRKr/jg9j9jC3ABGLLTN6ktzGJ1QgGgM0HwXd8plhhQGUysF5HZ6N63xXbdSl9N5wjb45AKHUIgw4zwtqw77ly3fsr9+yMTKDl3lDoT+fJvXf1Q59PKrjH2qkJRXAaOKQ4macNtueIUyMtWBqfVQI6ibzBvWfPtkR/lfKyqg42Z5grY/GcagSkXGOBxHSvrpCzWhmxsOaiIUzkpOukvpHPUYmpIIQKAACg6/o7L5ZXUaNejD0ijRXJVBMs9kSo=");
            case 1: return new Property("textures", "ewogICJ0aW1lc3RhbXAiIDogMTYzNDM1NTQwNDAyNSwKICAicHJvZmlsZUlkIiA6ICI2MjM5ZWRhM2ExY2Y0YjJiYWMyODk2NGQ0NmNlOWVhOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGYXRGYXRHb2QiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjc5ZGVjZTcyZGU0YzAzOWViMjU5ZTcwOWZhYzQ2OTY5OTA3ZGFlYTJlNDFlMzMwMzAxOTAxMTA4ZDY0YWZkMiIKICAgIH0KICB9Cn0=", "rdVrwTGI0MnUAS2N6Vm0JyoZa71BFK3dVKNrzR6wk5goAuHIQXWPzRqGlcEDcYDtqu5gCJbO7WX+zfummWlFEy0HM6UeufrTvrkUp7eu0bZdMgOn90UrkrFnP2zIrmpqPDGFad181aGSbG0UIMxtEe3kR5ennYfdjj6myv4yj3Pi/F8pa0ErvxuZF9Mz69cIZZVHgJaJS2kx6p+9fmQDVh2EVCRSXScIDnavSDKhftEXTgTFHCw5JIB+BSQQDAsQ8Vhi1j1XzRpoaIp3Nq8KIbc/nPAGPVz+xptek7x3MTeXxaGj4GXhhQ5hPcLccyfuAi+/9i6bwjgo+8l3TfNBg1MrhGui06Z84fFGKFZ+O3Q+uhFaSc+UL1X0UtgsgFwSbW2c80CJ+BMb8J+VgIrgTzcjTkHJh39gqFDSSQdmcdYmA5kWc6vGh/JR3+zpKrh28XebqWDYBcuoPKBBKlRbRaYL6inh1e594lNCaFV+s1izcwrlons7odPw6/2Grf/It1KKz8ruIzoOrlWSqxPbkY3JUH/4uLcfC/N9Z6DYzL4Egvs7K/IrTHjOUn1vYl+y0xowfnocAqnwREZbAJ8f+vZbmlA8BAVdu4ZOQIMxHEnSs5qwgsLiksOhymW0KClXK6wkYjFO7tZKMY/VWS9rpeUZCi9Vrg1537erW7e+hJ0=");
            case 2: return new Property("textures", "ewogICJ0aW1lc3RhbXAiIDogMTYzNTAxNTk4MjM1NywKICAicHJvZmlsZUlkIiA6ICJkMGI4MjE1OThmMTE0NzI1ODBmNmNiZTliOGUxYmU3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJqYmFydHl5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJiOTgwODgyNzMzOWE2NTMxNTliYzRhNDk1NDkyMGVjMjU4YWM0MWM0YzE0M2I0YmJmYjk1MjExMTAxMTVlN2EiCiAgICB9CiAgfQp9", "WUrMfNRvGVW0OZbneu/4cH8ylu0uXTxKp8grIAYgB8j2pDn9vEmCnQdElyniRk656OzU0ryo06rtRvdNE9mSdD7QuKgnGeNezDBeLelETZjDRTBqEdz925C+xcbvr6fyDZc7kiDtCWIwBf4E0tfuH9XC81xlKl9Xyllvr6MpvtJfGHqpWiqGB1gzrS4U1o/49Y9V99xv/4pN6pCv47VAHYyHD03Ve6W5Tx1v7eCtOtt7AXVeeSdYf409X9i9ds4ONAzDcgfXer6/2dojW7Tt8H3Cyt7MZRjwaUF9l0yBiTuUQoRxQySZaof8ZIoRIns5ZgQyEXJ6Uy/EI1xW9GpUYigYZQk9d5IxIOQjGG0Df4SDecj8FIZZEewax168FapnK5Vn0xqI7x6ezHu8DSn4T07YgQk+84VMNizm8vEmEtWfF8vZWuzfdRINPIVlM1/b8IvLWUvK0X07Rpx5bHbKGGTFjxbkhFQ2mOwq0fjBgIk9Oc5kanzjyzYKPpA9nhBTxUiXjFrofvbdlZi1TTr8WLr6EZNkm97apLimelyE4Ckcij/1Pyh1+TXvBl6FctOuEhicUTJwNTM5nZwGDFVlhlQOOJNIGn+0zZAiBP6LVYK222N1wjh23laIi6HYEBVPa+EQVXayviL96FQimTQPfwVBhn3flrFW5Q4iS3ZNKes=");
            default: return new Property("textures", "ewogICJ0aW1lc3RhbXAiIDogMTYzODIzMDE5Nzk2OCwKICAicHJvZmlsZUlkIiA6ICJhYTZhNzUwNWVkYmU0NjNiYjk1NWYyMWY0MjNiYTM1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3RhbmR5d2FyaG9sIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzhmODU0ZTM0MDA2NjliMWQyM2QwOWY5YzNiYzMzNjY1OTc5YmE5MTc3OTYzMTViOGU2Mjk1Y2QxYjlmOGRkMiIKICAgIH0KICB9Cn0=", "JGUVJVAmrerupJaH37o+Qdt5Z/50LOwgJxO0btTWV3Nidajsvo1sXyUQsYrpFixN4Golkb45Un2WxlnYdn/RtCnB8U1YcYA7p/5xzLHfBrmC6zUzbGSsqQcaFI3tVN38hNWo1TaTBwCTjPXe8LIzaoXIHdv53V71asA3GeNg1PYqxDH60URaH+GjrRiMj85z1iukoxUcjVQITf15GgcRMB3k2YP1+5OTidju8lXEJpOqxGx7HJAx22vXy9dK5xNud0exdH3aj0dhkA9tG+M873EidiJZ7omw1VjAi93HM0P1d7nBtDF1XO/ccmZX3ZnW5/IRszlXl7T0sPDq4nHkw/A2G3pPiaEmSzQ5ErcECzBXLrHtZPSHUtwOzCBR0bSLczjdwlKNifGTW/DeqnwB/PeWNKctYjeDMUEFEfbQxCVqEUvifL0JTerO7PscgIy2dibatSwEr/iM5FQmHAWxyv16BYWE8GzltjKLC5hJ+TJH7Ad5UE99CjqVZMxZZLb5nEt3sv26YF2nqe5gJmbWBbEGXVajZziXUlqO/uzIYAefUKPC0/2Um+rg1k1fMnOjrgJdyDu75b+Nq9MXcHawPC2d8dyZLSRywfYhat3m2t/3jQyw8n5BNuGLdtzimvHfO5WQp2fwmEiAofoE62Mu0vOOk8Jyb/Cg7NMX7MOIv84=");
        }
    }
}
