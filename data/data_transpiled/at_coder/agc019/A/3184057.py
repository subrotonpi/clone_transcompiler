def main ( ) :
    import sys
    from math import sin , cos , tan
    from math import pi , pi , pi , pi , pi
    Q , H , S , D , N = map ( lambda x : pi * x , range ( pi ) )
    H , S , D , N = map ( lambda x : pi * x , range ( pi ) )
    H , S , D = min ( Q * 2 , H ) , min ( H * 2 , S ) , min ( S * 2 , D )
    if N % 2 == 0 :
        print ( N / 2 * D )
    else :
        print ( N / 2 * D + S )
