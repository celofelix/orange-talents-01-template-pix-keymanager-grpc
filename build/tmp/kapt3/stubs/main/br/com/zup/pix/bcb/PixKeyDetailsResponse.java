package br.com.zup.pix.bcb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2 = {"Lbr/com/zup/pix/bcb/PixKeyDetailsResponse;", "", "keyType", "Lbr/com/zup/pix/bcb/KeyType;", "key", "", "bankAccount", "Lbr/com/zup/pix/bcb/BankAccount;", "owner", "Lbr/com/zup/pix/bcb/Owner;", "createdAt", "Ljava/time/LocalDateTime;", "(Lbr/com/zup/pix/bcb/KeyType;Ljava/lang/String;Lbr/com/zup/pix/bcb/BankAccount;Lbr/com/zup/pix/bcb/Owner;Ljava/time/LocalDateTime;)V", "getBankAccount", "()Lbr/com/zup/pix/bcb/BankAccount;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getKey", "()Ljava/lang/String;", "getKeyType", "()Lbr/com/zup/pix/bcb/KeyType;", "getOwner", "()Lbr/com/zup/pix/bcb/Owner;", "toPix", "Lbr/com/zup/pix/itau/Pix;", "key-manager-grpc"})
public final class PixKeyDetailsResponse {
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.pix.bcb.KeyType keyType = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String key = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.pix.bcb.BankAccount bankAccount = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.zup.pix.bcb.Owner owner = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime createdAt = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.itau.Pix toPix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.bcb.KeyType getKeyType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.bcb.BankAccount getBankAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.zup.pix.bcb.Owner getOwner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    public PixKeyDetailsResponse(@org.jetbrains.annotations.NotNull
    br.com.zup.pix.bcb.KeyType keyType, @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    br.com.zup.pix.bcb.BankAccount bankAccount, @org.jetbrains.annotations.NotNull
    br.com.zup.pix.bcb.Owner owner, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime createdAt) {
        super();
    }
}