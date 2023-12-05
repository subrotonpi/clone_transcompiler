def main ( arg = None ) :
    from os import path
    from random import randint
    from sys import stdin
    from os import chdir
    from string import ascii_letters
    from os.path import join
    from os import chdir
    N = int ( stdin.read ( ) )
    A = int ( stdin.read ( ) )
    B = int ( stdin.read ( ) )
    chdir ( '..' )
    ans = 0
    for i in range ( 1 , N + 1 ) :
        if split_n ( i ) >= A and split_n ( i ) <= B :
            ans += i
    print ( ans )
    def split_n ( n ) :
        sum = 0
        n = str ( n )
        S = n.split ( '' )
        for i in S :
            sum += int ( i )
        return sum
    return split_n
