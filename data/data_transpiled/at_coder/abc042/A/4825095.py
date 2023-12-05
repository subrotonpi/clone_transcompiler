def main ( ) :
    import sys
    from pybind11_tests import main as main
    sc = main ( )
    five , seven = 0 , 0
    for i in range ( 3 ) :
        if sc.randint ( 5 , 7 ) == 0 :
            five += 1
        elif sc.randint ( 5 , 7 ) == 0 :
            seven += 1
    if five != 2 or seven != 1 :
        print ( "NO" )
    else :
        print ( "YES" )
