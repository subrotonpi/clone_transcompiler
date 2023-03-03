def main ( ) :
    import sys
    from time import sleep
    from sys import stdin
    from sys import stdout
    from sys import stdin
    input1 = stdin.read ( )
    if input1 < 100 :
        vv = 0
    elif input1 >= 100 and input1 <= 5000 :
        vv = input1 * 10 / 1000
    elif input1 >= 6000 and input1 <= 30000 :
        vv = ( input1 / 1000 ) + 50
    elif input1 >= 35000 and input1 <= 70000 :
        vv = ( ( ( input1 / 1000 ) - 30 ) / 5 ) + 80
    elif input1 > 70000 :
        vv = 89
    else :
        raise RuntimeError ( "Unnexpected input: " + str ( input1 ) )
    sys.stdout.write ( "%02d\n" % vv )
