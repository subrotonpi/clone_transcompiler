def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from sys import stdin
    from os.path import expanduser
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import expanduser
    from os.path import join
    N = int ( stdin.read ( ) )
    vals = [ int ( x ) for x in stdin.read ( ).split ( ' ' ) ]
    ans , xor , acum , last_ok = 0 , 0 , 0 , 0 , 0
    for i in range ( N ) :
        xor ^= vals [ i ]
        acum += vals [ i ]
        while xor != acum :
            xor ^= vals [ int ( last_ok ) ]
            acum -= vals [ int ( last_ok ) ]
            last_ok += 1
        ans += i - last_ok + 1
    print ( ans )
