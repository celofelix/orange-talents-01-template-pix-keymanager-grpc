package br.com.zup.pix.bcb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\rB\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lbr/com/zup/pix/bcb/Owner;", "", "type", "Lbr/com/zup/pix/bcb/Owner$OwnerType;", "name", "", "taxIdNumber", "(Lbr/com/zup/pix/bcb/Owner$OwnerType;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTaxIdNumber", "getType", "()Lbr/com/zup/pix/bcb/Owner$OwnerType;", "OwnerType", "key-manager-grpc"})
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2 = {"Lbr/com/zup/pix/bcb/Owner$OwnerType;", "", "(Ljava/lang/String;I)V", "NATURAL_PERSON", "key-manager-grpc"})
    public static enum OwnerType {
        /*public static final*/ NATURAL_PERSON /* = new NATURAL_PERSON() */;
        
        OwnerType() {
        }
    }
}