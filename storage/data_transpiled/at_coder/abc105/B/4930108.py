def main ( ) :
    import sys
    if sys.argv [ 1 ] == '-' :
        a = 0
        just = False
    with open ( '/proc/cpuinfo' , 'r' ) as f :
        a = int ( f.read ( ) )
        for donuts in range ( 0 , a ) :
            for cake in range ( 0 , a ) :
                total = ( 4 * donuts ) + ( 7 * cake )
                if total == a :
                    just = True
        print ( 'Yes' if just else 'No' )
