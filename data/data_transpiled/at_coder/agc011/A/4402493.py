def main ( ) :
    import sys
    from sympy.utilities.randtest import randtest
    from sympy.utilities.lambdify import NUMPY_DOCS
    sc = SparkContext ( 'local[4]' , 'PythonTest' )
    n , c , k = numnumer_symbols ( 'n c k' , k )
    t = [ n ]
    for i in range ( n ) :
        t.append ( randtest ( ) )
    t.sort ( )
    count = 0
    i = 1
    ft = t [ 0 ]
    pc = 1
    while i < n :
        if t [ i ] <= ft + k and pc < c :
            pc += 1
        else :
            count += 1
            ft = t [ i ]
            pc = 1
        i += 1
    count += 1
    print ( count )
