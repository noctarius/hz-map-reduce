hz-map-reduce
=============

Hazelcast MapReduce Documentation Demo Application

### Resulting console output
```plain
Mrz 13, 2014 9:31:29 AM com.hazelcast.config.XmlConfigBuilder
Information: Looking for hazelcast.xml config file in classpath.
Mrz 13, 2014 9:31:29 AM com.hazelcast.config.XmlConfigBuilder
Warnung: Could not find hazelcast.xml in classpath.
Hazelcast will use hazelcast-default.xml config file in jar.
Mrz 13, 2014 9:31:29 AM com.hazelcast.config.XmlConfigBuilder
Information: Using configuration file file:/Users/noctarius/.m2/repository/com/hazelcast/hazelcast/3.2-RC2/hazelcast-3.2-RC2.jar!/hazelcast-default.xml in the classpath.
Mrz 13, 2014 9:31:30 AM com.hazelcast.instance.DefaultAddressPicker
Information: Prefer IPv4 stack is true.
Mrz 13, 2014 9:31:30 AM com.hazelcast.instance.DefaultAddressPicker
Information: Picked Address[192.168.2.157]:5701, using socket ServerSocket[addr=/0:0:0:0:0:0:0:0,localport=5701], bind any local is true
Mrz 13, 2014 9:31:30 AM com.hazelcast.system
Information: [192.168.2.157]:5701 [dev] [3.2-RC2] Hazelcast Community Edition 3.2-RC2 (20140306) starting at Address[192.168.2.157]:5701
Mrz 13, 2014 9:31:30 AM com.hazelcast.system
Information: [192.168.2.157]:5701 [dev] [3.2-RC2] Copyright (C) 2008-2013 Hazelcast.com
Mrz 13, 2014 9:31:30 AM com.hazelcast.instance.Node
Information: [192.168.2.157]:5701 [dev] [3.2-RC2] Creating MulticastJoiner
Mrz 13, 2014 9:31:30 AM com.hazelcast.core.LifecycleService
Information: [192.168.2.157]:5701 [dev] [3.2-RC2] Address[192.168.2.157]:5701 is STARTING
Mrz 13, 2014 9:31:38 AM com.hazelcast.cluster.MulticastJoiner
Information: [192.168.2.157]:5701 [dev] [3.2-RC2] 


Members [1] {
	Member [192.168.2.157]:5701 this
}

Mrz 13, 2014 9:31:38 AM com.hazelcast.core.LifecycleService
Information: [192.168.2.157]:5701 [dev] [3.2-RC2] Address[192.168.2.157]:5701 is STARTED
Mrz 13, 2014 9:31:38 AM com.hazelcast.partition.InternalPartitionService
Information: [192.168.2.157]:5701 [dev] [3.2-RC2] Initializing cluster partition table first arrangement...
Calculation finished! :)
Counts per words over 3 files:
	Word 'facilisis.' occured 2 times
	Word 'varius.' occured 2 times
	Word 'mattis' occured 5 times
	Word 'neque' occured 3 times
	Word 'nisl.' occured 2 times
	Word 'nisl,' occured 1 times
	Word 'sed,' occured 1 times
	Word 'dui.' occured 4 times
	Word 'sed.' occured 1 times
	Word 'dolor' occured 8 times
	Word 'dui,' occured 1 times
	Word 'egestas.' occured 1 times
	Word 'est' occured 3 times
	Word 'nibh' occured 1 times
	Word 'ante' occured 3 times
	Word 'egestas,' occured 1 times
	Word 'dictum' occured 4 times
	Word 'tristique' occured 1 times
	Word 'venenatis.' occured 1 times
	Word 'id,' occured 2 times
	Word 'odio,' occured 2 times
	Word 'lorem,' occured 1 times
	Word 'tellus,' occured 3 times
	Word 'dapibus' occured 2 times
	Word 'odio.' occured 2 times
	Word 'libero,' occured 3 times
	Word 'tellus.' occured 1 times
	Word 'viverra,' occured 1 times
	Word 'morbi' occured 1 times
	Word 'viverra.' occured 1 times
	Word 'erat' occured 3 times
	Word 'adipiscing' occured 10 times
	Word 'ultrices.' occured 2 times
	Word 'vehicula' occured 4 times
	Word 'lacinia' occured 3 times
	Word 'arcu' occured 8 times
	Word 'arcu.' occured 1 times
	Word 'euismod' occured 1 times
	Word 'imperdiet' occured 4 times
	Word 'libero.' occured 2 times
	Word 'pulvinar' occured 9 times
	Word 'aliquet' occured 2 times
	Word 'lacus.' occured 3 times
	Word 'euismod.' occured 2 times
	Word 'pretium' occured 7 times
	Word 'aliquet,' occured 2 times
	Word 'cursus' occured 3 times
	Word 'lacus,' occured 1 times
	Word 'non,' occured 2 times
	Word 'duis' occured 5 times
	Word 'ultrices' occured 4 times
	Word 'diam.' occured 1 times
	Word 'fringilla' occured 9 times
	Word 'lacinia.' occured 1 times
	Word 'diam,' occured 1 times
	Word 'luctus.' occured 1 times
	Word 'inceptos' occured 2 times
	Word 'dignissim' occured 3 times
	Word 'pellentesque' occured 15 times
	Word 'tortor' occured 6 times
	Word 'ultricies.' occured 2 times
	Word 'auctor.' occured 2 times
	Word 'nec' occured 15 times
	Word 'vivamus' occured 5 times
	Word 'porta' occured 4 times
	Word 'etiam' occured 5 times
	Word 'eu' occured 11 times
	Word 'quam' occured 7 times
	Word 'integer' occured 8 times
	Word 'a' occured 8 times
	Word 'amet,' occured 4 times
	Word 'ut' occured 13 times
	Word 'scelerisque' occured 3 times
	Word 'eros,' occured 2 times
	Word 'quam.' occured 4 times
	Word 'sit' occured 15 times
	Word 'praesent' occured 10 times
	Word 'molestie,' occured 1 times
	Word 'laoreet.' occured 1 times
	Word 'felis,' occured 2 times
	Word 'quam,' occured 1 times
	Word 'felis.' occured 2 times
	Word 'sagittis' occured 5 times
	Word 'posuere' occured 1 times
	Word 'nulla' occured 5 times
	Word 'eros.' occured 2 times
	Word 'vel' occured 13 times
	Word 'orci' occured 5 times
	Word 'et' occured 10 times
	Word 'hendrerit.' occured 2 times
	Word 'neque.' occured 3 times
	Word 'urna.' occured 1 times
	Word 'sodales' occured 5 times
	Word 'proin' occured 9 times
	Word 'eget,' occured 3 times
	Word 'urna,' occured 3 times
	Word 'metus' occured 3 times
	Word 'ante.' occured 1 times
	Word 'neque,' occured 2 times
	Word 'leo,' occured 2 times
	Word 'molestie' occured 4 times
	Word 'leo.' occured 5 times
	Word 'ornare' occured 2 times
	Word 'maecenas' occured 2 times
	Word 'congue' occured 2 times
	Word 'fusce' occured 4 times
	Word 'suscipit,' occured 1 times
	Word 'suscipit.' occured 1 times
	Word 'condimentum' occured 2 times
	Word 'rhoncus' occured 6 times
	Word 'lectus,' occured 1 times
	Word 'lectus.' occured 1 times
	Word 'ante,' occured 1 times
	Word 'justo' occured 6 times
	Word 'bibendum.' occured 1 times
	Word 'vitae' occured 9 times
	Word 'porttitor.' occured 3 times
	Word 'lacus' occured 3 times
	Word 'ut,' occured 2 times
	Word 'ut.' occured 1 times
	Word 'ullamcorper,' occured 1 times
	Word 'phasellus' occured 3 times
	Word 'iaculis' occured 4 times
	Word 'ullamcorper.' occured 4 times
	Word 'dui' occured 4 times
	Word 'tincidunt,' occured 1 times
	Word 'tincidunt.' occured 1 times
	Word 'turpis.' occured 1 times
	Word 'nec,' occured 1 times
	Word 'mauris,' occured 1 times
	Word 'turpis,' occured 2 times
	Word 'nec.' occured 1 times
	Word 'nostra,' occured 2 times
	Word 'mauris.' occured 3 times
	Word 'fermentum' occured 7 times
	Word 'nam' occured 4 times
	Word 'tincidunt' occured 8 times
	Word 'et,' occured 3 times
	Word 'tempor' occured 2 times
	Word 'blandit' occured 3 times
	Word 'suscipit' occured 6 times
	Word 'porttitor' occured 3 times
	Word 'ullamcorper' occured 4 times
	Word 'commodo,' occured 1 times
	Word 'odio' occured 3 times
	Word 'cras' occured 5 times
	Word 'interdum' occured 3 times
	Word 'vulputate' occured 5 times
	Word 'interdum.' occured 2 times
	Word 'augue' occured 4 times
	Word 'mollis.' occured 1 times
	Word 'eu.' occured 1 times
	Word 'metus,' occured 1 times
	Word 'at' occured 7 times
	Word 'accumsan' occured 6 times
	Word 'pulvinar.' occured 1 times
	Word 'eros' occured 5 times
	Word 'placerat' occured 2 times
	Word 'sed' occured 19 times
	Word 'ac' occured 14 times
	Word 'ad' occured 2 times
	Word 'nisi' occured 4 times
	Word 'scelerisque.' occured 1 times
	Word 'egestas' occured 5 times
	Word 'sem' occured 7 times
	Word 'nisl' occured 4 times
	Word 'luctus' occured 8 times
	Word 'aliquam.' occured 2 times
	Word 'pretium.' occured 1 times
	Word 'pharetra' occured 7 times
	Word 'diam' occured 4 times
	Word 'purus.' occured 2 times
	Word 'quisque' occured 5 times
	Word 'aenean' occured 5 times
	Word 'mauris' occured 6 times
	Word 'urna' occured 6 times
	Word 'tellus' occured 2 times
	Word 'enim.' occured 1 times
	Word 'orci,' occured 4 times
	Word 'suspendisse' occured 5 times
	Word 'rutrum' occured 4 times
	Word 'semper' occured 4 times
	Word 'elit' occured 6 times
	Word 'aptent' occured 2 times
	Word 'at,' occured 2 times
	Word 'tempus' occured 4 times
	Word 'mollis' occured 10 times
	Word 'rutrum,' occured 1 times
	Word 'magna.' occured 2 times
	Word 'mi.' occured 1 times
	Word 'ipsum.' occured 1 times
	Word 'ac,' occured 1 times
	Word 'faucibus' occured 4 times
	Word 'ac.' occured 1 times
	Word 'sociosqu' occured 2 times
	Word 'magna,' occured 1 times
	Word 'non' occured 12 times
	Word 'ipsum' occured 6 times
	Word 'sem.' occured 3 times
	Word 'turpis' occured 4 times
	Word 'sapien,' occured 3 times
	Word 'consectetur,' occured 1 times
	Word 'sapien.' occured 1 times
	Word 'risus,' occured 1 times
	Word 'risus.' occured 2 times
	Word 'nullam' occured 7 times
	Word 'enim' occured 1 times
	Word 'a.' occured 3 times
	Word 'lobortis' occured 2 times
	Word 'ligula.' occured 2 times
	Word 'ligula,' occured 4 times
	Word 'quis' occured 11 times
	Word 'facilisis' occured 5 times
	Word 'tempus.' occured 1 times
	Word 'tristique,' occured 1 times
	Word 'consectetur' occured 9 times
	Word 'varius' occured 2 times
	Word 'litora' occured 2 times
	Word 'accumsan.' occured 2 times
	Word 'accumsan,' occured 1 times
	Word 'dapibus.' occured 2 times
	Word 'dapibus,' occured 1 times
	Word 'mi' occured 6 times
	Word 'donec' occured 11 times
	Word 'convallis' occured 1 times
	Word 'lorem' occured 7 times
	Word 'nunc' occured 9 times
	Word 'leo' occured 4 times
	Word 'massa' occured 7 times
	Word 'enim,' occured 2 times
	Word 'iaculis.' occured 1 times
	Word 'eget' occured 16 times
	Word 'justo,' occured 1 times
	Word 'per' occured 4 times
	Word 'justo.' occured 3 times
	Word 'faucibus.' occured 1 times
	Word 'nulla.' occured 3 times
	Word 'conubia' occured 2 times
	Word 'feugiat' occured 6 times
	Word 'malesuada' occured 6 times
	Word 'consequat' occured 6 times
	Word 'taciti' occured 2 times
	Word 'consequat.' occured 1 times
	Word 'fringilla,' occured 1 times
	Word 'amet' occured 11 times
	Word 'sapien' occured 4 times
	Word 'gravida' occured 6 times
	Word 'quis,' occured 2 times
	Word 'malesuada,' occured 1 times
	Word 'pellentesque,' occured 1 times
	Word 'libero' occured 6 times
	Word 'malesuada.' occured 1 times
	Word 'vitae,' occured 2 times
	Word 'velit' occured 1 times
	Word 'non.' occured 2 times
	Word 'volutpat' occured 7 times
	Word 'mattis,' occured 1 times
	Word 'auctor' occured 2 times
	Word 'laoreet' occured 1 times
	Word 'class' occured 2 times
	Word 'volutpat.' occured 1 times
	Word 'nunc,' occured 1 times
	Word 'vitae.' occured 4 times
	Word 'nunc.' occured 2 times
	Word 'nisi,' occured 1 times
	Word 'dignissim.' occured 1 times
	Word 'lectus' occured 3 times
	Word 'dignissim,' occured 1 times
	Word 'nisi.' occured 3 times
	Word 'condimentum,' occured 1 times
	Word 'bibendum' occured 5 times
	Word 'mattis.' occured 1 times
	Word 'velit.' occured 1 times
	Word 'commodo' occured 7 times
	Word 'hendrerit' occured 4 times
	Word 'sollicitudin' occured 2 times
	Word 'blandit.' occured 2 times
	Word 'id' occured 16 times
	Word 'viverra' occured 4 times
	Word 'ornare,' occured 1 times
	Word 'felis' occured 9 times
	Word 'nibh,' occured 4 times
	Word 'aliquam' occured 8 times
	Word 'sagittis,' occured 1 times
	Word 'sagittis.' occured 1 times
	Word 'ornare.' occured 1 times
	Word 'nibh.' occured 2 times
	Word 'elementum' occured 5 times
	Word 'vestibulum' occured 4 times
	Word 'eleifend' occured 6 times
	Word 'ultricies' occured 4 times
	Word 'curabitur' occured 7 times
	Word 'magna' occured 5 times
	Word 'torquent' occured 2 times
	Word 'porta,' occured 1 times
	Word 'dictum,' occured 1 times
	Word 'venenatis' occured 4 times
	Word 'elit.' occured 5 times
	Word 'in' occured 11 times
	Word 'cursus,' occured 2 times
	Word 'cursus.' occured 2 times
	Word 'augue,' occured 1 times
	Word 'tortor,' occured 1 times
	Word 'risus' occured 5 times
	Word 'purus' occured 4 times
	Word 'ligula' occured 5 times
	Word 'himenaeos.' occured 2 times
All content sums up to 1117 words.
Mrz 13, 2014 9:31:38 AM com.hazelcast.core.LifecycleService
Information: [192.168.2.157]:5701 [dev] [3.2-RC2] Address[192.168.2.157]:5701 is SHUTTING_DOWN
Mrz 13, 2014 9:31:38 AM com.hazelcast.initializer
Information: [192.168.2.157]:5701 [dev] [3.2-RC2] Destroying node initializer.
Mrz 13, 2014 9:31:38 AM com.hazelcast.instance.Node
Information: [192.168.2.157]:5701 [dev] [3.2-RC2] Hazelcast Shutdown is completed in 21 ms.
Mrz 13, 2014 9:31:38 AM com.hazelcast.core.LifecycleService
Information: [192.168.2.157]:5701 [dev] [3.2-RC2] Address[192.168.2.157]:5701 is SHUTDOWN
```