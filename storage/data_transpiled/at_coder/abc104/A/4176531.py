def main ( args ) :
    import sys
    from time import sleep
    sc = Scanner ( )
    r = sc.next ( )
    if r < 1200 :
        print ( "ABC" )
    elif r < 2800 :
        print ( "ARC" )
    else :
        print ( "AGC" )
