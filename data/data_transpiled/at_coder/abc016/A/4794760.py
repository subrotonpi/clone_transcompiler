def main ( ) :
    import sys
    from os import path
    from time import sleep
    with open ( path.join ( sys.argv [ 1 ] , '..' ) , 'r' ) as f :
        md = f.read ( ).split ( )
    m , d = int ( md [ 0 ] ) , int ( md [ 1 ] )
    ret = 'NO'
    if m % d == 0 :
        ret = 'YES'
    print ( ret )
