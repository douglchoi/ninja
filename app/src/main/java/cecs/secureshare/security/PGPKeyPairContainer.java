package cecs.secureshare.security;

import org.spongycastle.openpgp.PGPPublicKeyRing;
import org.spongycastle.openpgp.PGPSecretKeyRing;

/**
 * A simple container for public and private key rings
 */
public class PGPKeyPairContainer {

    private PGPPublicKeyRing publicKeyRing;
    private PGPSecretKeyRing secretKeyRing;

    /**
     * @param publicKeyRing
     * @param secretKeyRing
     */
    public PGPKeyPairContainer(PGPPublicKeyRing publicKeyRing, PGPSecretKeyRing secretKeyRing) {
        this.publicKeyRing = publicKeyRing;
        this.secretKeyRing = secretKeyRing;
    }

    public PGPPublicKeyRing getPublicKeyRing() {
        return publicKeyRing;
    }

    public PGPSecretKeyRing getSecretKeyRing() {
        return secretKeyRing;
    }
}