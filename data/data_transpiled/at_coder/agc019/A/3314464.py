def import import min , tty , getopt , repeat , error
from os import urandom
from random import randint
from time import time as gmtime
try :
    from tty import tcgetattr
