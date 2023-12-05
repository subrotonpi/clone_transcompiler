def main ( arg = None ) :
    from os import environ
    from os.path import join
    from os import sep
    from os import chdir
    from string import ascii_letters
    from os.path import join
    S = join ( chdir ( expanduser ( '~' ) ) , S )
    A = int ( S [ 0 ] )
    B = int ( S [ 1 ] )
    C = int ( S [ 2 ] )
    D = int ( S [ 3 ] )
    chdir ( expanduser ( '~' ) )
    ans = 0
    ope = [ '+' , '-' ]
    for ope1 in ope :
        for ope2 in ope :
            for ope3 in ope :
                if ope1 == '+' :
                    ans = A + B
                else :
                    ans = A - B
                if ope2 == '+' :
                    ans += C
                else :
                    ans -= C
                if ope3 == '+' :
                    ans += D
                else :
                    ans -= D
                if ans == 7 :
                    s = '{}{}{}{}{}=7'.format ( A , ope1 , B , ope2 , C , ope3 , D )
                    print ( s )
                    sys.exit ( )
                else :
                    ans = 0
