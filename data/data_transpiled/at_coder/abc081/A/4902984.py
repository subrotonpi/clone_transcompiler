def main ( ) :
    import sys
    from os import path
    sc = open ( path.join ( path.dirname ( __file__ ) , '..' , 'README.rst' ) )
    line = sc.readline ( ).split ( '' )
    sc.close ( )
    cnt = 0
    for i in line :
        if i == '1' :
            cnt += 1
    print ( cnt )
