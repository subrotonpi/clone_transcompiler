def main ( ) :
    import sys
    from pybind11_tests import main as main
    with main ( ) as sc :
        N = len ( sc.input ( ) )
        ans = '1'
        for i in range ( N - 1 ) :
            ans += '0'
        ans += '7'
        print ( ans )
