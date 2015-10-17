#!/usr/bin/env bash

nohup java -XX:+UseParallelGC -XX:ParallelGCThreads=4 -cp .:smsc.cli-app-1.0-SNAPSHOT.jar:lib com.nuevatel.smsccli.App $1 $2 > ws-subscriber.tmp &