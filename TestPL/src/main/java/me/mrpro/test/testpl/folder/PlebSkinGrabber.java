package me.mrpro.test.testpl.folder;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.minecraft.server.v1_16_R1.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_16_R1.PlayerConnection;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.util.Random;

public class PlebSkinGrabber {
    public static void changePlebSkin(Player player) {
        GameProfile profile = ((CraftPlayer) player).getHandle().getProfile();
        PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
        connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, ((CraftPlayer) player).getHandle()));
        profile.getProperties().removeAll("textures");
        profile.getProperties().put("textures", getPlebSkin());
        connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, ((CraftPlayer) player).getHandle()));
    }
    private static Property getPlebSkin(){
        Random p = new Random();
        int num = p.nextInt(3);
        switch(num){
            case 0: return new Property("textures", "ewogICJ0aW1lc3RhbXAiIDogMTYzNjE1MDA4NTI1NywKICAicHJvZmlsZUlkIiA6ICIwM2E5NjQ5NDA0NzI0MmE2YTQxYjljNGJhM2QwY2E5OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJlcmljZXBwcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85ZTg3M2EyNWYwYjNmZWQ0NWNkNTBjODA1NzMxODc0N2JjYjUyMmU0ZTM2MmI2NzlmYzZjMGJiZmVmNGY4MjBmIgogICAgfQogIH0KfQ==", "qRupG5eqxD/AenHGg4j3ELGJ2YeVm7smV3GxGQ6///Q/joQYWSGQguVo+eX+G3F+3kERq/VJHZecxnt9J+5B5Aat4vozI46Runcv2sSj9v7B7tLz5WLDKOBzryZbiygzncE4JzTrpqlmnvSxpwsW3XBuaFXnK1G4Odgo+Lzk2VFhnf11pJilMpGnrjEaP01OafgtHA9CfOAIpu3YkOXkc9J/xgX5pX3FxcdXmMmtWppw7JVen3YLoqP9fL/7NGEuoEJ99jlhdKVi3ZVIbWmh/KCOaXEYZUqVHXrRRfiJppeOqis9fDbNNP2qMTd4+3JbWVK7KLEMjMepOd9QMOzim51AyDeGxx9eS5li5yz4Hb1PYWt9mvUPKTCExTqxGByWq2tJTJ2O28tjmr8tiQOdKSQyccyy35hreBO6uwvtiHuS6ECWTa2P1/q8cVYfmJ2ON3wfUCyAAuvnsBEUIh8d373XrBCi4Er/MFxugj41yMGj/aCZy8YLcm39J+eMrSY0M6tgt2e28dD3UPmCzwvYi8bx88r5+byH10UhCUOWc8YvsY+DK0T/+gfj9a5rxymI/XdCtMpbeo5gzYrmdz54kw0mM28PYZCn+Utb++M0Uj2sIst8YasPjPleK/Vc1Zh8ryv4y8mOS44GKtDCsQVG0l8RdUQaQAJeTXiTHJb1KbM=");
            case 1: return new Property("textures", "ewogICJ0aW1lc3RhbXAiIDogMTYzNDc3NDgwMzg2OCwKICAicHJvZmlsZUlkIiA6ICIxZjEyNTNhYTVkYTQ0ZjU5YWU1YWI1NmFhZjRlNTYxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3RNaUt5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzYxZTBkOTkyZjEzYWVjOGFmYzViOTZiYTAzMThjMTA1YTAyMWQxYWFmNzExMzVjYmU1NzljYmUxMTFjYzdjMTIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==", "LvsMPTZ4ykgHSE+U41V8FF5Z6AzP4IiItu9YagjG0keY2RimZrjy6OBBMsP0fKlJTZrHU2j/8DTYtGVWhXlEpUwOWe8lEnzw+AR9mSOuJ/fN+fdKm+RvDs385DozOAIDAOKjozNreIPmFGJFNB913WTDwUxYQiIXgez+6THAey4uD1iXgHqVOGWi1OSx5W5doVPL7g3iNr0JjXomIGz+PDYp3l1ng8cVwzmn/I0mQSPYGabi+n3Og0jgSSaAgLDb9l0TSLLq6zLbqT4yenL0BQfje8z6S3FcxxISJY13mPZRJwhfFs0epkX/S44uQqWfv6YsBLgO/sURMiKEYvwoT94fKJX7gsHQCCGVBuA8nWvEfa13kVDdDd5iPBkDvDA0+iDxXejxE9bF3zQ4Vl60MFqSt0rcNs49RDq+Bldtdr0TUIxdfaq9sKumGuLsn+hxEU3kwfz/7kBkWNeWYN6aVlbVeQpHPBhY41QyBJWjKDgeLV95qFBwXEjzP1HCQMXr+94VoVmSY220EbNqkTB2SNT+yca/1tiObLOu4UrA9fXeRtWKm/HcLum7Qm6PXQJI4R8OvKTIVQrlW62fHe3i3pJKeO1OvMq58QLFe6iVX2Btvr2DAfV+ruNQ9ycXcNY6PA3gRwrWDgYnETHQR6Co1w1ryaFqoshXmbk/aQ0OWXw=");
            default: return new Property("textures", "ewogICJ0aW1lc3RhbXAiIDogMTYzNDQ3Mjk3NjY0NCwKICAicHJvZmlsZUlkIiA6ICJlZDUzZGQ4MTRmOWQ0YTNjYjRlYjY1MWRjYmE3N2U2NiIsCiAgInByb2ZpbGVOYW1lIiA6ICI0MTQxNDE0MWgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzZmY2E3YjJmZmFmMTFhNTAzZDc0YzI0ZTliMWU3M2JlZGQ0NzgyYTZjMGEyZDQ4NTNkNjkzNTIxZGRmOTYwNSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9", "esR58rg1KeBeF1o5/97g8G0SiJJbS0Q43y+HnFwOqWb2xN0M4Bo2cQYS8KilfuazFTMNMak36el/sG/B6q0fF+FHSC1RhsInVBeHtHW5PWyi+GcrFFIY05yLaI+G1LkW6rKxcacQGJi7fqIPIGb3tAx4jAnqEkkiOwDB20JlBYcKDu8vedHJ6cUtbnETEU1qDLgPwy4q5nzPSnGwzc3n/iyODCsAbchTY3bJ5U8wOftwVvT8ho5rqRI2V9CiY6eUOPACF7fAPOrKL2zWA4zug3N6cdV/5EqwR+YWrkF4XVKbXgA/HUIt4Nuq/gTGFt675rD0YGLElCv9OO5XvtiL/0vSlsdcwcKbAt8S1AThqw540iA6l/fpOxDclHFoYj6fMsooeWsm6pFETOFsHlo6NzuPMQK4x3HJhdYl5PAVwir1gSjW2upTQf4MV3330iuUUmtB7YfraozNZttebCBAvp6bANfOjDuRnUq1Kg6/7B4hdkwKmBQ/zbmpqneP29S09y4RoDWej0WYNwAUacjSHZ8SSv9pZCLkOj4aVsEkp2ZizP5ZHN0YUdYm6CRax0Lc3vJmcYbFobh/rxMo1AsoPomQZj6JwAlh1SXYvVu9G0/mN8Lt8gxIi7l5X0j804mg1fma7Jcz65pmhVo6hUpq3A1V7ti8mUBLur2NAwrBTSI=");
        }
    }
}

