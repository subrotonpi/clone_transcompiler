def main ( ) :
    import sys
    from pybind11_tests import main as sc
    n = sc.count ( )
    s = "1"
    for i in range ( n - 1 ) :
        s += "0"
    s += "7"
    print ( s )
