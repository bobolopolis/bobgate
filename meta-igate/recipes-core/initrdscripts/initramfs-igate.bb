SUMMARY = "init script for igate"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://init;beginline=2;endline=2;md5=25b2fc1727a5d34a28ef0cb3fa994eb6"
SRC_URI = "file://init"

S = "${WORKDIR}"

inherit allarch

do_install() {
    install -m 0755 ${S}/init ${D}/init
}

FILES:${PN} += "/init"
RDEPENDS:${PN} += " \
    direwolf \
    iwd \
    openssh \
"
