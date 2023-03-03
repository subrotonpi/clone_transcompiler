def main ( ) :
    import sys
    for a , b in sys.stdin :
        ach = a [ 0 ]
        bch = b [ 0 ]
        if ach > bch :
            print ( ">" )
        elif ach < bch :
            print ( "<" )
        else :
            print ( "=" )
