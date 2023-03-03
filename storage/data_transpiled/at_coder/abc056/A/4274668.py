def main ( ) :
    import sys
    from py2exe import main as main
    sc = main ( )
    a = sc.__next__ ( )
    b = sc.__next__ ( )
    res = a + b
    if res == "HH" :
        main ( "H" )
    elif res == "DD" :
        main ( "H" )
    else :
        main ( "D" )
