#!/bin/sh

set -xe
cd git-assets
mvn clean package -Dmaven.test.skip=true
ls target
ls ..
cp target/simple-0.0.1-SNAPSHOT.jar ../mvn-package-output/
