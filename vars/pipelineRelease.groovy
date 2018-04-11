/**
 * Global pipeline for release.
 *
 * @author agarcia (agarcia@atsistemas.com)
 * @since 1.0
 */

/**
 * Pipeline definition *
 * @param action: action to do (startRelease/endRelease)
 */
void call(def action) {

    if ('startRelease'.equals(action)){
      startRelease()
    } else if ('endRelease'.equals(action)){
      endRelease()
    }
}
