def main ( ) :
    import sys
    import string
    import csv
    class Main ( object ) :
        def __init__ ( self ) :
            input = sys.stdin.readline ( )
            word = input.strip ( )
            freq = [ c - 'a' for c in word.split ( ) ]
            for i in range ( 26 ) :
                if not freq [ i ] :
                    print ( chr ( i ) + 'a' )
                    return
            print ( 'None' )
    return Main ( )
