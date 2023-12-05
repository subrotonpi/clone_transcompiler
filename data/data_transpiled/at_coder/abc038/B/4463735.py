def main ( ) :
    import sys
    scn = sys.stdin
    h1 = scn.read ( )
    m1 = scn.read ( )
    h2 = scn.read ( )
    m2 = scn.read ( )
    if h1 == h2 or h1 == m2 or m1 == h2 or m1 == m2 :
        print ( "YES" )
    else :
        print ( "NO" )
