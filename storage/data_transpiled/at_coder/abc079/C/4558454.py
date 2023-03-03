def main ( ) :
    import os
    from time import sleep
    scn = os.popen ( "cat /dev/ttyACM0" )
    ABCD = scn.read ( )
    A = ABCD // 1000
    B = ( ABCD % 1000 ) // 100
    C = ( ABCD % 100 ) // 10
    D = ABCD % 10
    if A + B + C + D == 7 :
        print ( "%d+%d+%d+%d=%d" % ( A , B , C , D , 7 ) )
        return
    if A + B + C - D == 7 :
        print ( "%d+%d+%d-%d=%d" % ( A , B , C , D , 7 ) )
        return
    if A + B - C + D == 7 :
        print ( "%d+%d+%d-%d=%d" % ( A , B , C , D , 7 ) )
        return
    if A + B - C - D == 7 :
        print ( "%d+%d+%d+%d" % ( A , B , C , D , 7 ) )
        return
    if A - B + C - D == 7 :
        print ( "%d+%d+%d" % ( A , B , C , D , 7 ) )
        return
    if A - B + C - D == 7 :
        print ( "%d+%d+%d" % ( A , B , C , D , 7 ) )
        return
    if A - B - C - D == 7 :
        print ( "%d+%d+%d" % ( A , B , C , D , 7 ) )
        return
