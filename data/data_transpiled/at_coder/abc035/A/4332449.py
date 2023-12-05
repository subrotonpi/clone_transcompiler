def main ( ) :
    import sys
    from time import sleep
    from sys import stdin
    W = stdin.recv_multipart ( )
    H = stdin.recv_multipart ( )
    if W * 3 == H * 4 :
        print ( '4:3' )
    else :
        print ( '16:9' )
