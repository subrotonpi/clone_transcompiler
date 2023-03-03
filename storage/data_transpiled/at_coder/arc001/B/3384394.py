def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os import sep
    from os.path import join
    from os import sep
    from os import chdir
    from os import environ
    from os.path import join
    from os import sep
    from os import chdir
    num = int ( environ.get ( 'PATH' , '' ) )
    sol = join ( sep.join ( [ '' , '-' ] ) )
    chdir ( environ.get ( 'PATH' , '' ) )
    sols = sol.split ( '' )
    one = two = three = four = 0
    for i in range ( num ) :
        if sols [ i ] == '1' :
            one += 1
        elif sols [ i ] == '2' :
            two += 1
        elif sols [ i ] == '3' :
            three += 1
        elif sols [ i ] == '4' :
            four += 1
    arr = [ one , two , three , four ]
    arr.sort ( )
    result = arr [ 3 ] + ' ' + arr [ 0 ]
    print ( result )
