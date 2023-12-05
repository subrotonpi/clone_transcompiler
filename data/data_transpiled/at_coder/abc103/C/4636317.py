def main ( args ) :
    import sys
    from os.path import expanduser
    from os.path import join
    from os import sep
    from os.path import join
    n = len ( expanduser ( '~' ) )
    ans = 0
    for i in range ( n ) :
        ans += join ( expanduser ( '~' ) , '~' , i )
    print ( ans - n )
