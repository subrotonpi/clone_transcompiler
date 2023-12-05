def import import os , sys , subprocess , subprocess , args , ** kwargs ) :
    from subprocess import Popen , PIPE
    stdout , stderr = subprocess.Popen ( args , stdout = PIPE , stderr = PIPE , ** kwargs ).communicate ( )
    str_list = stdout.split ( )
    case_num = int ( str_list [ 0 ] )
    listened_cd_num = int ( str_list [ 1 ] )
    listen_disk = 0
    cd_case = [ ]
    for i in range ( 1 , case_num + 1 ) :
        cd_case.append ( i )
    for i in range ( listened_cd_num ) :
        disk = int ( stdout.split ( ) [ 1 ] )
        for j in range ( case_num ) :
            if cd_case [ j ] == disk :
                cd_case [ j ] = listen_disk
                listen_disk = disk
    for disk_num in cd_case :
        print ( disk_num )
