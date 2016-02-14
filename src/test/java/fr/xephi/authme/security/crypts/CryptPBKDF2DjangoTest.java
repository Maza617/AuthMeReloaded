package fr.xephi.authme.security.crypts;

import fr.xephi.authme.ConsoleLoggerTestInitializer;
import org.junit.BeforeClass;

/**
 * Test for {@link CryptPBKDF2Django}.
 */
public class CryptPBKDF2DjangoTest extends AbstractEncryptionMethodTest {

    @BeforeClass
    public static void setupLogger() {
        ConsoleLoggerTestInitializer.setupLogger();
    }

    public CryptPBKDF2DjangoTest() {
        super(new CryptPBKDF2Django(),
            "pbkdf2_sha256$15000$50a7ff2d7e00$t7Qx2CfzMhGEbyCa3Wk5nJvNjj3N+FdxhpwJDerl4Fs=",  // password
            "pbkdf2_sha256$15000$f9d8a58f3fe2$oMqmMGuJetdubW0cpubmT8CltQLjHT+L2GuwKsaWLx8=",  // PassWord1
            "pbkdf2_sha256$15000$1170bc7a31f5$Ex/2aQsXm4kogLIYARpUPn04ccK5LYYjyVPpl32ALjE=",  // &^%te$t?Pw@_
            "pbkdf2_sha256$15000$c029bd67eea4$Hfw992SL2WtYQ6g2WLdxA09hbmMDwjrr/Z+uUggbxwo="); // âË_3(íù*
    }

}
