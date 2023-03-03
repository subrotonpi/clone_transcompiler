def main ( ) :
    import sys
    from string import letters
    sc = open ( '/etc/init.d/','r' )
    c1 = sc.read ( ).split ( ',' )
    c2 = sc.read ( ).split ( ',' )
    sc.close ( )
    ans = False
    if c1 [ 0 ] == c2 [ 2 ] and c1 [ 1 ] == c2 [ 1 ] and c1 [ 2 ] == c2 [ 0 ] :
        ans = True
    print ( 'YES' if ans else 'NO' )
