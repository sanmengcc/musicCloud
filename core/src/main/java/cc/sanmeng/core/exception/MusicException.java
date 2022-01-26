package cc.sanmeng.core.exception;

import java.text.MessageFormat;

/**
 *
 */
public class MusicException extends RuntimeException {
    private static final long serialVersionUID = 6961926234532027069L;
    private String code;

    public MusicException(String message) {
        super(message);
    }

    public MusicException(Throwable cause) {
        super(cause);
    }

    public MusicException(String message, Throwable cause) {
        super(message, cause);
    }

    public MusicException() {
    }

    public MusicException(String code, String msg) {
        this(msg);
        this.code = code;
    }

    public MusicException(Enum<?> en) {
        this(en.name(), en.toString());
    }

    public MusicException(Enum<?> en, Object... args) {
        this(en.name(), MessageFormat.format(en.toString(), args));
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
