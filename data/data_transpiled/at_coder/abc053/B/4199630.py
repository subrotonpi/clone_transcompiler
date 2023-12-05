def main ( ) :
    import sys
    from string import printable
    s = printable.replace ( "\n" , "" )
    start_a = end_z = 0
    for i in range ( len ( s ) ) :
        if s [ i ] == "A" :
            start_a = i
            break
    for i in range ( len ( s ) - 1 , - 1 , - 1 ) :
        if s [ i ] == "Z" :
            end_z = i
            break
    print ( end_z - start_a + 1 )
    sys.exit ( 1 )
