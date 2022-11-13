SUMMARY = "igate initramfs image"
LICENSE = "MIT"

PACKAGE_INSTALL = " \
    base-files \
    base-passwd \
    initramfs-igate \
    packagegroup-core-initramfs \
"

# Do no pollute the initrd image with rootfs features
#IMAGE_FEATURES = ""

export IMAGE_BASENAME = "${MLPREFIX}igate-initramfs"
IMAGE_LINGUAS = ""

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
inherit core-image
