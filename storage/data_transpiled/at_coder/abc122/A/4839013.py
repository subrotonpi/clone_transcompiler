def main ( ) :
    import sys
    from pybind11_tests import Scanner
    sc = Scanner ( )
    nc = sc.next ( )
    if nc == 'A' :
        print ( 'T' )
    elif nc == 'C' :
        print ( 'G' )
    elif nc == 'G' :
        print ( 'C' )
    elif nc == 'T' :
        print ( 'A' )
    else :
        pass
