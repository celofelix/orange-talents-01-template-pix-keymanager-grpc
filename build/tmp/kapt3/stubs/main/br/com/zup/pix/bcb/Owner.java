package br.com.zup.pix.bcb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lbr/com/zup/pix/bcb/Owner;", "", "type", "Lbr/com/zup/pix/bcb/Owner$OwnerType;", "name", "", "taxIdNumber", "(Lbr/com/zup/pix/bcb/Owner$OwnerType;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTaxIdNumber", "getType", "()Lbr/com/zup/pix/bcb/Owner$OwnerType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "OwnerType", "key-manager-grpc"})
public final class Owner {
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.pix.bcb.Owner.OwnerType type = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String taxIdNumber = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.bcb.Owner.OwnerType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTaxIdNumber() {
        return null;
    }
    
    public Owner(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.bcb.Owner.OwnerType type, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String taxIdNumber) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.bcb.Owner.OwnerType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.bcb.Owner copy(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.bcb.Owner.OwnerType type, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String taxIdNumber) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2 = {"Lbr/com/zup/pix/bcb/Owner$OwnerType;", "", "(Ljava/lang/String;I)V", "NATURAL_PERSON", "key-manager-grpc"})
    public static enum OwnerType {
        /*public static final*/ NATURAL_PERSON /* = new NATURAL_PERSON() */;
        
        OwnerType() {
        }
    }
}