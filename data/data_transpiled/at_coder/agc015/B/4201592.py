def main ( args ) :
    import sys
    from os.path import expanduser
    with open ( expanduser ( '~' ) ) as sc :
        S = sc.read ( )
    ans = 0
    for i , s in enumerate ( S ) :
        if s == 'U' :
            ans = ans + ( len ( S ) - 1 - i ) + s * 2
        else :
            ans = ans + ( len ( S ) - 1 - i ) * 2 + s
    print ( ans )
