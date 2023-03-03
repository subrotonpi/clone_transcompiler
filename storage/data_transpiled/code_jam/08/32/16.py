def _import ( ) :
    from io import BytesIO
    from ugly import ugly_numbers
    class Ugly_numbers ( ugly_numbers ) :
        def go ( l , m2 , m3 , m5 , m7 , f ) :
            if l == 0 :
                if m2 == 0 or m3 == 0 or m5 == 0 or m7 == 0 : return 1
                return 0
            if dp [ l ] [ m2 + 1 ] [ m3 + 2 ] [ m5 + 4 ] [ m7 + 6 ] != - 1 :
                return dp [ l ] [ m2 + 1 ] [ m3 + 2 ] [ m5 + 4 ] [ m7 + 6 ]
    ans = go ( len ( s ) , 0 , 0 , True )
    print ( "Case #%d: %d" % ( test , ans ) )
