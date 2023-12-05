def main ( ) :
    import sys
    from os import path
    from os import path
    with open ( path.join ( path.dirname ( __file__ ) , '..' , '..' , '..' , '..' , '..' ) , 'r' ) as sc :
        W , H = sc.read ( ).split ( ':' )
        if W % 16 == 0 and H % 9 == 0 :
            print ( '16:9' )
        elif W % 4 == 0 and H % 3 == 0 :
            print ( '4:3' )
