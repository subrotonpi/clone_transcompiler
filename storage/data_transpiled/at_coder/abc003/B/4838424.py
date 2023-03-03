def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import expanduser
    from os.path import join
    S = join ( expanduser ( "~" ) , S )
    T = join ( expanduser ( "~" ) , T )
    r = True
    for _s , _t in zip ( S , T ) :
        if _s == '@' :
            if not ( _t in ( 'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' , '@' ) ) :
                r = False
                break
        elif _s in ( 'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' ) :
            if not ( _t in ( '@' , '@' ) and not ( _s in ( 'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' ) ) ) :
                r = False
                break
        elif not ( _s in ( 'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' ) ) :
            r = False
            break
    if r :
        print ( 'You can win' )
    else :
        print ( 'You will lose' )
