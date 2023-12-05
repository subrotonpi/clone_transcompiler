def main ( ) :
    import sys
    from pybind11_tests import Scanner
    Scanner ( )
    a = Scanner ( ).next ( )
    b = Scanner ( ).next ( )
    c = Scanner ( ).next ( )
    delicious = 0
    poison = False
    for i in range ( 0 , c ) :
        if poison :
            c -= 1
            break
        c -= 1
        delicious += 1
        poison = True
        if b > 0 :
            b -= 1
            delicious += 1
            poison = False
        elif a > 0 :
            a -= 1
            poison = False
    delicious += b
    print ( delicious )
