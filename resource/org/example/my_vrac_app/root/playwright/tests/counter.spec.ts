// @ts-check
import { test, expect } from "@playwright/test";

test.beforeEach(async ({ page }) => {
  await page.goto("/");
});

test("counter inc", async ({ page }) => {
  const counterButton = page.getByTestId("counter-button");
  const counterValue = page.getByTestId("counter-value");

  // Check initial counter value is 0
  await expect(counterValue).toHaveText("0");

  // Click the counter button and verify it increments
  await counterButton.click();
  await expect(counterValue).toHaveText("1");

  // Click again and verify it increments further
  await counterButton.click();
  await expect(counterValue).toHaveText("2");
});
