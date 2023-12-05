def main ( ) :
    import sys
    from string import atoi
    from string import digits
    sc = Scanner ( )
    s = sc.next ( )
    a = int ( s )
    sum = 0
    for i in s :
        sum += int ( i )
    print ( "Yes" if a % sum == 0 else "No" )
