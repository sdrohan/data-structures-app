package datastructures

import LIFOStack
import interfaces.Stack
import lifoStackOf
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LIFOStackTest {

    @Test
    fun `push should add elements to the stack`() {
        // Arrange
        val stack = lifoStackOf<Int>()

        // Act
        stack.push(1)
        stack.push(2)
        stack.push(3)

        // Assert
        assertEquals(3, stack.size())
        assertFalse(stack.isEmpty())
    }


    @Test
    fun `pop should remove and return the top element from the stack`() {
        // Arrange
        val stack = lifoStackOf<Int>()
        stack.push(1)
        stack.push(2)

        // Act
        val poppedElement = stack.pop()

        // Assert
        assertEquals(2, poppedElement)
        assertEquals(1, stack.size())
    }

    @Test
    fun `isEmpty should return true if the stack is empty`() {
        // Arrange
        val stack = lifoStackOf<Int>()

        // Act & Assert
        assertTrue(stack.isEmpty())

        stack.push(1)
        assertFalse(stack.isEmpty())
    }

    @Test
    fun `peek on an empty stack should return null`() {
        // Arrange
        val stack = lifoStackOf<Int>()

        // Act
        val topElement = stack.peek()

        // Assert
        assertNull(topElement)
        assertTrue(stack.isEmpty())
    }

    @Test
    fun `pop on an empty stack should return null`() {
        // Arrange
        val stack = lifoStackOf<Int>()

        // Act
        val poppedElement = stack.pop()

        // Assert
        assertNull(poppedElement)
        assertTrue(stack.isEmpty())
    }

    @Test
    fun `size should return the number of elements in the stack`() {
        // Arrange
        val stack = lifoStackOf<Int>()

        // Act & Assert
        assertEquals(0, stack.size())

        stack.push(1)
        assertEquals(1, stack.size())

        stack.push(2)
        assertEquals(2, stack.size())
    }

    @Test
    fun `peek should return the top element from the stack without removing it`() {
        // Arrange
        val stack = lifoStackOf<Int>()
        stack.push(1)
        stack.push(2)

        // Act
        val topElement = stack.peek()

        // Assert
        assertEquals(2, topElement)
        assertEquals(2, stack.size())
    }

    @Test
    fun `pushAll for lists should add all elements to the stack`() {
        // Arrange
        val stack = lifoStackOf<String>()
        val items = listOf("Cat", "Dog", "Mouse", "Horse", "Giraffe")

        // Act
        stack.pushAll(items)

        // Assert
        assertEquals(5, stack.size())
        assertFalse(stack.isEmpty())
    }

    @Test
    fun `pushAll for sets should add all elements to the stack`() {
        // Arrange
        val stack = lifoStackOf<String>()
        val items = setOf("Cat", "Dog", "Mouse", "Horse", "Giraffe")

        // Act
        stack.pushAll(items)

        // Assert
        assertEquals(5, stack.size())
        assertFalse(stack.isEmpty())
    }


    @Test
    fun `popAll should remove and return all elements from the stack in reverse order`() {
        // Arrange
        val stack: Stack<Int> = LIFOStack()
        stack.push(1)
        stack.push(2)
        stack.push(3)

        // Act
        val poppedElements = stack.popAll()

        // Assert
        assertEquals(listOf(3, 2, 1), poppedElements)
        assertTrue(stack.isEmpty())
    }


}