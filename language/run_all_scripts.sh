#!/usr/bin/env bash

# Script correctness verification

find . -name '*.groovy' -execdir groovy {} \; -execdir echo "{} ... success" \;