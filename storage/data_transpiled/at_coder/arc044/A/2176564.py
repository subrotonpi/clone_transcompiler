def main ( ) :
    import sys
    from string import atoi
    from math import log
    from string import digits
    sc = open ( "/proc/test_main.txt" , "r" )
    s = sc.read ( )
    n = int ( s )
    t = s.split ( "" )
    if n == 3 or n == 2 or n == 5 :
        print ( "Prime" )
        return
    if n % 2 == 0 or n % 5 == 0 or n == 1 :
        print ( "Not Prime" )
        return
    sum = 0
    for i in t :
        sum += int ( i )
    if sum % 3 == 0 :
        print ( "Not Prime" )
    else :
        print ( "Prime" )
