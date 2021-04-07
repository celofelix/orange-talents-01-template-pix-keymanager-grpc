package br.com.zup.pix.bcb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\b"}, d2 = {"Lbr/com/zup/pix/bcb/KeyType;", "", "(Ljava/lang/String;I)V", "CPF", "PHONE", "EMAIL", "RANDOM", "Companion", "key-manager-grpc"})
public enum KeyType {
    /*public static final*/ CPF /* = new CPF() */,
    /*public static final*/ PHONE /* = new PHONE() */,
    /*public static final*/ EMAIL /* = new EMAIL() */,
    /*public static final*/ RANDOM /* = new RANDOM() */;
    public static final br.com.zup.pix.bcb.KeyType.Companion Companion = null;
    
    KeyType() {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/pix/bcb/KeyType$Companion;", "", "()V", "by", "Lbr/com/zup/pix/bcb/KeyType;", "domainType", "Lbr/com/zup/pix/itau/TipoChave;", "key-manager-grpc"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull
        public final br.com.zup.pix.bcb.KeyType by(@org.jetbrains.annotations.NotNull
        br.com.zup.pix.itau.TipoChave domainType) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}