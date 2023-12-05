def main ( ) :
    import sys
    cnt = 0
    with open ( 'Takahashikun.txt' , 'r' ) as f :
        n = f.read ( )
    data = u'Takahashikun'
    sss = u'Takahashikun.'
    data = data.upper ( )
    sss = sss.upper ( )
    for i in range ( 1 , n + 1 ) :
        s = f.read ( )
        s = s.upper ( )
        if s == data == True or s == sss == True :
            cnt += 1
    print ( cnt )
