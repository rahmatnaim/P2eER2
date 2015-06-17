package my.utm.rmc.p2eer.util;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by rahmatnaim on 6/11/15.
 */
public class BitmapCache extends LruCache<Integer, Bitmap> {

    private static final int KILO = 1024;
    private static final int MEMORY_FACTOR = 2 * KILO;

    public BitmapCache() {
        super((int) (Runtime.getRuntime().maxMemory() / MEMORY_FACTOR));
    }

    @Override
    protected int sizeOf(final Integer key, final Bitmap value) {
        return value.getRowBytes() * value.getHeight() / KILO;
    }
}
