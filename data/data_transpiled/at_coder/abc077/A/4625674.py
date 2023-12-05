def main ( ) :
    import os
    from string import ascii_letters
    scn = open ( '/etc/init.d/' , 'r' )
    a = scn.read ( ).split ( ' ' )
    b = scn.read ( ).split ( ' ' )
    ans = True
    for i in range ( 3 ) :
        ans &= a [ i ] == b [ 2 - i ]
    print ( 'YES' if ans else 'NO' )
