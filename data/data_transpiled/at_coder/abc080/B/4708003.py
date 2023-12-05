def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    input_number = stdin.read ( )
    tmp , added_number = input_number , 0
    while tmp > 0 :
        added_number += tmp % 10
        tmp /= 10
    if input_number % added_number == 0 :
        print ( "Yes" )
    else :
        print ( "No" )
