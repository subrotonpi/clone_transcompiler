def main ( ) :
    import sys
    from pybind11_tests import main as sc
    cnt = 700
    S = sc.next ( )
    for i in range ( 3 ) :
        if S [ i ] == 'o' :
            cnt += 100
    print ( cnt )
